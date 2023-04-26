#necessary imports
from noughtsandcrosses_2329584 import *

def main():
    #array list of values ,used as game board
    board = [ ['1','2','3'],\
              ['4','5','6'],\
              ['7','8','9']]

    #calling welcome function
    welcome(board)
    #total score is initialized as 0
    total_score = 0
    while True:
        #menu function returns choice (of user)
        choice = menu()
        if choice == '1':
            #if if condition is true play_game function is called
            score = play_game(board)
            #and obtained score is added to total score
            total_score += score
            #prints
            print('Your current score is:',total_score)
        if choice == '2':
            # if if condition is true save_score function is called
            save_score(total_score)
        if choice == '3':
            #if if condition is true load_scores function is called
            #display_leadeboard function is called which displays 
            leader_board = load_scores()
            display_leaderboard(leader_board)
        if choice == 'q':
            #if if condition is true ,prints the following messages and returns
            print('Thank you for playing the "Unbeatable Noughts and Crosses" game.')
            print('Good bye')
            return


 # checks if it is running as main function    
# if __name__ == '__main__':
main()