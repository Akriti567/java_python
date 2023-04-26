import string  
char = string.ascii_uppercase + string.ascii_uppercase   #storing uppercase in char
def welcome():   #defining function welcome
    print('Welcome to the Caesar Cipher')   #printing this statement
    print("This program encrypts and decrypts text with the Casesar Cipher.")   #printing this statement
def enter_message():   #defining function enter_message
    while True:
        user = input("Would you like to encrypt (encr) or decrypt (decr):")   #asking user for encryption or decryption
        if user == 'encr':  #checks whether the var user is equals to encr or decr
            encrypt()    #if user==encr then converts plain text to cipher text
            break      #terminates from if 
        elif user == 'decr':   #checks whether the var user is equals to encr or decr
            decrypt()    #if user==decr then converts cipher text to plain text
            break   
        else:
            print("Invalid Mode") #prints invalid
            continue #ends the iteration
def encrypt(): #defining function encrypt
    encrypt = list(input("What message would you like to encrypt: ").upper()) #asking input from the  user #.upper converts to uppercase and stores in encrypt
    while True:
        shift = input("What is the shift number: ")  #asking input from user and storing in shift
        if shift.strip().isdigit(): #removes space and checks digits ,returns boolean
            shift = int(shift) #takes integer in shift
            break  
        else:
            print("Invalid shift") #prints invalid shift if value of shift is not an integer
            continue     #ends this iteration
    for i in range(len(encrypt)):   #takes length of input in encrypt given by user in loop
        if encrypt[i] == ' ':  #creating empty space for encrypt[i]
            encrypt[i] == ' '
        else:
            cod = char.index(encrypt[i]) + shift #adds index position of input given by user and shift and stores in cod
            encrypt[i] = char[cod] #gives output in uppercase coming from cod and storing in cod
    print(''.join(map(str, encrypt)))  #joins the str and encrypt in one string
def decrypt():
    decrypt = list(input("What message would you like to decrypt: ").upper())  #asking input from the  user #.upper converts to uppercase and stores in decrypt
    while True:
        shift = input("What is the shift number: ")  #asking input from user and storing in shift
        if shift.strip().isdigit():  #removes space and checks digits ,returns boolean
            shift = int(shift)   #takes integer in shift
            break
        else:
            print("Invalid shift") #prints invalid if shift is no integer
            continue   #ends this iteration
    for i in range(len(decrypt)):  #takes length of input in decrypt given by user in loop
        if decrypt[i] == ' ':  #creating empty space for decrypt[i]
            decrypt[i] = ' '  
        else:
            cod = char.index(decrypt[i]) - shift #subtracts index position of input given by user and shift and stores in cod
            decrypt[i] = char[cod] #gives output in uppercase coming from cod and storing in cod

    print(''.join(map(str, decrypt))) #joins the str and decrypt in one string
welcome() #function call
enter_message() #function call
while True:
    more = input("Would you like to encrypt or decrypt another message? (Y/N): ") #asking input from the user
    if more == 'Y':
        enter_message() #calling the function
    elif more == 'N':
        print("Thank you for using the program, goodbye!") #printing this statement
        break  #terminates from if 
    else:
        continue  #ends the iteration