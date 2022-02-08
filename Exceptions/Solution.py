#!/bin/python3

import math
import os
import random
import re
import sys


if __name__ == '__main__':
    S = input().strip()

    try:
        S = int(S)
        print(S)
    except:
        print("Bad String")
