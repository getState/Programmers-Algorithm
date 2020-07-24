def solution(board, moves):
    answer = 0
    stk = []
    for element in moves:
        element = element-1
        for i in range(len(board)):
            if board[i][element]>0:
                if len(stk)!=0 and stk[-1]==board[i][element]:
                    stk.pop()
                    board[i][element] = 0
                    answer += 2
                else:
                    stk.append(board[i][element])
                    board[i][element] = 0
                break
    return answer