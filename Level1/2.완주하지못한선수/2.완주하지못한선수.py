def solution(participant, completion):
    answer = ''
    hashParticipant = {}
    for element in participant:
        if element in hashParticipant:
            hashParticipant[element] += 1
        else:
            hashParticipant[element] = 1
    
    for element in completion:
        if hashParticipant[element] == 1:
            del hashParticipant[element]
        else:
            hashParticipant[element] -= 1
    
    for key in hashParticipant.keys():
        answer = key
    return answer