
import random as rand

class Wordle:

    def __init__(self):
        
        self.rules()
        self.word_list = []
        with open ("valid-wordle-words.txt") as valid_words:
            for word in valid_words:
                self.word_list.append(word.replace("\n",""))
        
        self.blank_board()
        self.row = 0
        self.position = {
            0: { 0 : " ", 1 : " ", 2 : " ", 3 : " ", 4 : " ", },
            1: { 0 : " ", 1 : " ", 2 : " ", 3 : " ", 4 : " ", },
            2: { 0 : " ", 1 : " ", 2 : " ", 3 : " ", 4 : " ", },
            3: { 0 : " ", 1 : " ", 2 : " ", 3 : " ", 4 : " ", },
            4: { 0 : " ", 1 : " ", 2 : " ", 3 : " ", 4 : " ", },
        }


    def word_picker(self):
        picked_word = self.word_list[rand.randrange(1,len(self.word_list))]
        return picked_word
    
    def green_text(self, text):
        green = ("\033[92m {}\033[00m" .format(text))
        green.replace(" ", "")
        return green
    
    def yellow_text(self, text):
        yellow = "\033[93m {}\033[00m".format(text)
        yellow.replace(" ", "")
        return yellow
    
    def rules(self):
        print("Welcome to Daniel's Wordle Game")
        line_1 = "A" + self.green_text("green") + " letter means the letter is correct and in the right position"
        line_2 = "A" + self.yellow_text("yellow") + " letter means the letter is correct and in the wrong position"
        line_3 = "A white letter means the letter is not correct"
        print(line_1)
        print(line_2)
        print(line_3)
    
    def valid_word(self,word):
        if (word in self.word_list):
            return True
        else:
            return False
    
    def word_to_list_of_chars(self,word):
        return [char for char in word]

    def letter_calculation(self, guess, answer):
        guess_char_list = self.word_to_list_of_chars(guess)
        answer_char_list = self.word_to_list_of_chars(answer)
        green_dict = {}
        yellow_dict = {}
        wrong_dict = {}
        for i in range(5):
            if guess_char_list[i] == answer_char_list[i]:
                green_dict[i] = guess_char_list[i]
            elif guess_char_list[i] in answer_char_list:
                yellow_dict[i] = guess_char_list[i]
            else:
                wrong_dict[i] = guess_char_list[i]
        return green_dict,yellow_dict,wrong_dict

    def run(self):
        answer = self.word_picker()
        game_over = False
        
        while not game_over:
            
            # while(not valid_guess):
            #     guess = self.get_guess()
            #     valid_guess = self.valid_word(guess)
            guess = self.get_guess()
            green_dict,yellow_dict,wrong_dict = self.letter_calculation(guess, answer)
            self.create_board(green_dict,yellow_dict,wrong_dict)
            game_over = self.check_game_over(guess,answer)
        if(self.row > 4):
            print("You Lose")
        else:
            print("You Win!!!")
    
    def check_game_over(self,guess,answer):
        # print(self.row)
        if (self.row > 4) :
            return True
        elif guess == answer:
            return True
        return False




    def get_guess(self):
        # print(self.word_list)
        # print(self.valid_word("yeard"))
        good = False
        while (not good):
            guess = input("What is your guess? ").replace(" ", "")
            good = self.valid_word(guess)
            if not good:
                print("Not a valid Word")
        return guess

    def blank_board(self):
        print("┌───┬───┬───┬───┬───┐")
        print("│ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │ " + " " + " │")
        print("└───┴───┴───┴───┴───┘")

    def create_board(self, green_dict,yellow_dict,wrong_dict):
        for column in green_dict:
            self.position[self.row][column] = self.green_text(green_dict[column]).replace(" ", "")
        for column in yellow_dict:
            self.position[self.row][column] = self.yellow_text(yellow_dict[column]).replace(" ", "")
        for column in wrong_dict:
            self.position[self.row][column] = wrong_dict[column]
        
        print("┌───┬───┬───┬───┬───┐")
        print("│ " + self.position[0][0] + " │ " + self.position[0][1] + " │ " + self.position[0][2] + " │ " + self.position[0][3] + " │ " + self.position[0][4] + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + self.position[1][0] + " │ " + self.position[1][1] + " │ " + self.position[1][2] + " │ " + self.position[1][3] + " │ " + self.position[1][4] + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + self.position[2][0] + " │ " + self.position[2][1] + " │ " + self.position[2][2] + " │ " + self.position[2][3] + " │ " + self.position[2][4] + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + self.position[3][0] + " │ " + self.position[3][1] + " │ " + self.position[3][2] + " │ " + self.position[3][3] + " │ " + self.position[3][4] + " │")
        print("├───┼───┼───┼───┼───┤")
        print("│ " + self.position[4][0] + " │ " + self.position[4][1] + " │ " + self.position[4][2] + " │ " + self.position[4][3] + " │ " + self.position[4][4] + " │")
        print("└───┴───┴───┴───┴───┘")
        self.row += 1

if __name__ == "__main__":
    wordle = Wordle()
    wordle.run()
