# pick empty square
# try all numbers
# find one that works
# repeat
# backtrack 

board = [
    [0, 6, 2, 4, 0, 5, 7, 3, 0],
    [0, 8, 0, 7, 0, 3, 2, 0, 9],
    [0, 7, 0, 9, 2, 0, 6, 5, 0],
    [0, 0, 1, 6, 0, 0, 8, 0, 4],
    [0, 0, 9, 0, 3, 1, 5, 0, 7],
    [0, 0, 0, 0, 0, 0, 0, 0, 3],
    [4, 0, 0, 0, 0, 7, 0, 0, 2],
    [2, 1, 0, 0, 0, 0, 4, 0, 0],
    [7, 0, 3, 2, 0, 4, 9, 0, 6]
]

def print_board(board_in):
    
    for row in range(len(board_in)):
        if row % 3 == 0 and row != 0:
            print("- - - - - - - - - - - -") # after three rows print horizontal line

        for column in range(len(board_in[0])):
            if column % 3 == 0 and column != 0:
                print(" | ", end="") # after three columns print vertical line

            if column == 8:
                print(board_in[row][column]) # goes to next line after reaches end of row
            else:
                print(str(board_in[row][column]) + " ", end="") # otherwise just prints the row

def is_valid(board_in, position, num ):
    pos_row = position[0]
    pos_column = position[1]
    #row
    for i in range(len(board_in)):
        if board_in[pos_row][i] == num and pos_column != i: # for every number in row, if there is a number that is equal to num in and at the same time not equal to the position column return false
            return False
    #column
    for i in range(len(board_in)):
        if board_in[i][pos_column] == num and pos_row != i: # for every number in column, if there is a number that is equal to num in and at the same time not equal to the position row return false
            return False
    #box
    x = pos_column // 3
    y = pos_row // 3

    for row in range(y * 3, (y * 3) + 3):
        for column in range(x * 3, (x * 3) + 3):
            if board_in[row][column] == num and (row,column) != position: # return false if any number matches num thats in another position in the box
                return False
    
    return True

def get_empty(board_in):
    for row in range(len(board_in)):
        for column in range(len(board_in)):
            if board_in[row][column] == 0 :
                return (row, column)
    return None

def solve(board_in):
    empty = get_empty(board_in)
    if not empty:
        return True
    else:
        row, column = empty
    
    for value in range(1, 10):
        if is_valid(board_in,(row, column), value):
            board_in[row][column] = value

            if solve(board_in):
                return True
            board_in[row][column] = 0
    return False

print_board(board)
solve(board)
print("\n\n--------------------\n\n")
print_board(board)