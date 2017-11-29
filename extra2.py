__author__ = "Neha Upadhyay"

"""
FILENAME : extra2.py
Authors  : Neha Upadhyay (nxu3128@rit.edu)
This program defines a function extra1 which takes in two parameters
S and M and gives the result and also prints the choices made for every
computation in e(S,M).
"""

# Sequence of words S
# n words in the sequence
# n words of length l1 l2....ln
# M maximum number of characters in a line
# contains words from i to j
# exactly one space between words
# extra space in the end M - j + i - summation(k=i to j) lk or infinite if M is exceeded
# choice is for the choices returned after every call to e(S, M)
import math

def extra2(S, M):
    words = S.split(" ")
    n = len(l)
    maximumSpaceCount = []
    choice = []
    for i in range(len(words)+1):
        temp = []
        tempBoolean = []
        for j in range(M+1):
            temp.append(0)
            tempBoolean.append(False)
        maximumSpaceCount.append(temp)
        choice.append(tempBoolean)         #Keeps appending list choices with the decision made in e(S,M)

    for i in range(len(words)-2, -1, -1):
        l = len(words[i])
        for j in range(M-l+1):
            choice[i][j] = True
            maximumSpaceCount[i][j] = maximumSpaceCount[i+1][0] + M - (j+l)
            if 1 + len(words[i+1]) + j + l <= M :
                val = 1 + maximumSpaceCount[i+1][j+1+l]
                if val < maximumSpaceCount[i][j]:
                    maximumSpaceCount[i][j] = val
                    choice[i][j] = False

    print("(Extra2) Total minimum spaces except last line: ", maximumSpaceCount[0][0])
    printParagraph(choice, n)
    return choice       #returns the list of choices with the decision made in e(S,M)

def printParagraph(S,choice):
        '''i = choice
        if i == 1:
            k = 1
        else:
            k = printParagraph(S, choice, i - 1) + 1

        print(S[i - 1:j])
        return k'''

def main():
    S = ["Hi Hello", "How are", "you I", "am Fine"]
    l = []
    M = 6
    choice = extra2(S,M)
    length = len(S)
    print(printParagraph(S, choice, length))

if __name__ == "__main__":
    main()




