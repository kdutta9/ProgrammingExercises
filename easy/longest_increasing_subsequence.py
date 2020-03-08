# This program will return the longest increasing subsequence of a list.

# indicator variable to start interactive program
on_off_switch = 1

# converts input string from interactive mode to a list of numbers
def clean_list(lst):
    """
    Removes '[', ']', ',' from a list.
    >>> clean_list(['[', '2', ',', '3', ',', '4', ']'])
    [2, 3, 4]
    """
    element_lst = filter(lambda a: a != '[' and a != ']' and a != ',' and a != ' ', lst)
    return [int(x) for x in element_lst]

def larger_values(val, lst):
    """
    Returns values of list larger than specified val.
    >>> larger_values(3, [1,2,3,4,5,4,5])
    [4, 5, 4, 5]
    >>> larger_values(2, [-1, 0, 1])
    []
    >>> larger_values(1, [1,5,6,0,2])
    [5, 6, 2]
    """
    assert type(val) == int or type(val) == float, 'first input must be integer or float type'
    assert type(lst) == list, 'second input must be list'

    return [x for x in lst if x > val]

def max_len(lst1, lst2):
    """
    Returns list that has greater length.
    >>> max_len([2,3,4], [5,6,7,8])
    [5, 6, 7, 8]
    >>> max_len([1,2,3], [1,2])
    [1, 2, 3]
    >>> max_len([2,3,4], [1,5,6])
    [2, 3, 4]
    """
    assert type(lst1) == list and type(lst2) == list, 'inputs must both be lists'

    if len(lst1) >= len(lst2):
        return lst1
    return lst2

def longest_increasing_subsequence(lst):
    """Return the longest strictly increasing subsequence of a list


    >>> longest_increasing_subsequence([1])
    [1]
    >>> longest_increasing_subsequence([1,2])
    [1, 2]
    >>> longest_increasing_subsequence([1,1,2,6,24,120,3,4,5])
    [1, 2, 6, 24, 120]
    >>> longest_increasing_subsequence([1,2,3,4,5,4])
    [1, 2, 3, 4, 5]
    >>> longest_increasing_subsequence([700,70,800,900,1000])
    [70, 800, 900, 1000]
    >>> longest_increasing_subsequence([2,3,4,1,2,3,4,5,6])
    [1, 2, 3, 4, 5, 6]
    """
    assert type(lst) == list, 'input must be a list'

    # returns list if empty or of one element
    if len(lst) <= 1:
        return lst

    # if first element is greater than second, bypass the element and recurse on remaining list
    elif lst[0] > lst[1]:
        return longest_increasing_subsequence(lst[1:])

    # return the longest list, either with or without first element
    else:
        return max_len([lst[0]] + longest_increasing_subsequence(larger_values(lst[0], lst)), longest_increasing_subsequence(lst[1:]))

# interactive mode that is set to start when program is run
while on_off_switch == 1:
    lst = list(input("Type Python list to return the longest increasing subsequence: "))
    clean_lst = clean_list(lst)
    print(longest_increasing_subsequence(clean_lst))
    on_off_switch_indicator = input("Type '1' to use again, type anything else to exit: ")
    if on_off_switch_indicator == '1':
        on_off_switch = 1
    else:
        exit()
