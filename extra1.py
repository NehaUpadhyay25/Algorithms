__author__ = "Neha Upadhyay"

"""
FILENAME : extra2.py
Authors  : Neha Upadhyay (nxu3128@rit.edu)
This program defines a function extra1 which takes in two parameters
S and M and gives the result.
"""

def extra1(S,M):
    words = S.split(" ")
    para = []
    maximumSpaceCount = []
    for i in range(len(words)+1):
        temp = []
        for j in range(M+1):
            temp.append(0)
            para.append(words[j])
        maximumSpaceCount.append(temp)

    for i in range(len(words)-2, -1, -1):
        l = len(words[i])
        for j in range(M-l+1):
            maximumSpaceCount[i][j] = maximumSpaceCount[i+1][0] + M - (j+l)
            if 1 + len(words[i+1]) + j + l <= M :
                val = 1 + maximumSpaceCount[i+1][j+1+l]
                if val < maximumSpaceCount[i][j]:
                    maximumSpaceCount[i][j] = val

    print("(Extra1) Total minimum spaces except last line: ", maximumSpaceCount[0][0])
    print(para)

def main():
    S = "Hi Hello How are you I am Fine"
    M = 6
    extra1(S,M)

if __name__ == "__main__":
    main()