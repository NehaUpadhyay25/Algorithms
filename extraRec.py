__author__ = "Neha Upadhyay"

"""
FILENAME : extraRec.py
Authors  : Neha Upadhyay (nxu3128@rit.edu)
This program implements a recursive funtion extraRec and takes
three parameters S,M and i in and computes the result.
"""

# Sequence of words S
# n words in the sequence
# n words of length l1 l2....ln
# M maximum number of characters in a line
# contains words from i to j
# exactly one space between words
# extra space in the end M - j + i - summation(k=i to j) lk or infinite if M is exceeded

import math

def extraRec(S, M, i):
    words = S.split(" ")
    j = i
    wordCharacters=0
    para = []
    spaceCount=0
    if len(words[i]) > M:
        return math.inf      #Prints infinity when number of extra space exceeds M
    else:
        while j < len(words) and wordCharacters <= M:

            #If condition below checks for the initial condition when i = j and also
            # ensures that the word length of j should not exceed M
            if (j == i) and (wordCharacters + len(words[j]) <= M):
                wordCharacters += len(words[j])
                para.append(words[j])

            #elif condition checks if the wordCharacters and length of current word does not exceed M
            #as M depicts the maximum number of characters a line can hold. So if this condition evalueates
            #to True then only that word will be counted
            elif (j != i) and (wordCharacters + len(words[j]) + 1 <= M):
                wordCharacters += len(words[j]) + 1
                spaceCount += 1
                para.append(words[j])

            else:
                break
            j += 1

    if j < len(words) - 1:
        extraRec(S, M, j)   #Base case for recursive call

    print("(ExtraRec) Total minimum spaces except last line: ", j)
    print(para)
    return j

def main():
    S = "Hi Hello How are you I am Fine"
    M = 3
    i = 3
    extraRec(S,M,i)

if __name__ == "__main__":
    main()
