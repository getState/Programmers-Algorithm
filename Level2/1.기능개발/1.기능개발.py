def solution(progresses, speeds):
    answer = []
    maxNum = 0
    count = 0
    for i in range(len(progresses)):
        days = 0
        
        if (100-progresses[i])%speeds[i]==0:
            days = int((100-progresses[i])/speeds[i])
        else:
            days = int((100-progresses[i])/speeds[i]) + 1
        
        if i==0:
            maxNum = days
        count += 1
        if days>maxNum:
            answer.append(count-1)
            maxNum = days
            count = 1
        
    answer.append(count)
    return answer