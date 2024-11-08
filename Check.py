def check(word):
    value = ''
    str = word
    
    while True:
        for i in range(len(str)):
            current = str[i:i+2]
            if current == 'pi':
                str = str.replace('pi', '')
            elif current == 'ka':
                str = str.replace('ka', '')
        if 'pi' in str or 'ka' in str:
            continue
        else:
            break
        
    while True:
        for i in range(len(str)):
            current = str[i:i+3]
            if current == 'chu':
                str = str.replace('chu', '')
        if 'chu' in str:
            continue
        else:
            break
    
    if len(str) == 0:
        return "YES"
    else:
        return "NO"
        
    
print(check('pikapichu')) # --> YES
print(check('pluh')) # --> NO
print(check('pchui')) # --> NO