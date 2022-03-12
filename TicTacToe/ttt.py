
import random
import time


pos = ["1","2","3","4","5","6","7","8","9"]

def main_menu():
    print("Main Menu")
    print("1. Play")
    print("2. Quit")

def selection():
    selection = input("Selection: ")
    if (selection == "1"):
        play()
    
    elif (selection == "2"):
        quit()
    else:
        print("Try Again")
        selection()


def play():
    print("Would you like to play a person or a robot")
    opponent = input("1. Person \n2. Bot\n")
    if (opponent == '1'):
        player_vs_player()
    elif (opponent == '2'):
        player_vs_bot()
    else:
        print("Wrong Answer: try again")
        play()

def player_vs_player():
    board()
    p1_turn = True
    game_over = False
    count = 0
    while(game_over == False):
        game_over = check_game_over(count)
        while(p1_turn):
            
            placement = input("O Choose your placement: ")
            if (is_valid_placement(placement)):
                pos[int(placement) - 1] = 'O'
                board()
                count += 1
                p1_turn = not p1_turn
        game_over = check_game_over(count)
        while(not p1_turn and not game_over):
            game_over = check_game_over(count)
            placement = input("Choose your placement: ")
            if (is_valid_placement(placement)):
                pos[int(placement) - 1] = 'X'
                board()
                count += 1
                p1_turn = not p1_turn
        
    if(p1_turn) :
        print("Player 2 Wins")
    else:
        print("Player 1 Wins")

def check_game_over(count):
    if (count >= 9):
        return True
    elif (pos[0] == pos[1] and pos[0] == pos[2]):
        return True
    elif (pos[3] == pos[4] and pos[5] == pos[3]):
        return True
    elif (pos[6] == pos[7] and pos[6] == pos[8]):
        return True
    elif (pos[0] == pos[3] and pos[0] == pos[6]):
        return True
    elif (pos[1] == pos[4] and pos[1] == pos[7]):
        return True
    elif (pos[2] == pos[5] and pos[2] == pos[8]):
        return True
    elif (pos[0] == pos[4] and pos[4] == pos[8]):
        return True
    elif (pos[2] == pos[4] and pos[4] == pos[6]):
        return True
    else:
        return False

def player_vs_bot():
    pass

def board():
    print("┌───┬───┬───┐")
    print("│ " + str(pos[0]) + " │ " + str(pos[1]) + " │ " + str(pos[2]) + " │")
    print("├───┼───┼───┤")
    print("│ " + str(pos[3]) + " │ " + str(pos[4]) + " │ " + str(pos[5]) + " │")
    print("├───┼───┼───┤")
    print("│ " + str(pos[6]) + " │ " + str(pos[7]) + " │ " + str(pos[8]) + " │")
    print("└───┴───┴───┘")

def is_valid_placement(placement):
    try:
        if str(int(placement)) in pos:
            return True
    except:
        return False

main_menu()
selection()