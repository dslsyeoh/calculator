Simple calculator with enum and lambda

Default
--
Total will be accumulated 

Clear
--
Reset total back to 0

Use case 1
--
1. calculator.add(1.5, 3.5)
2. calculator.clear()
3. calculator.add(1.5, 3.5).getTotal()

Result: 5

Use case 2
--
1. calculator.add(1.5, 3.5)
2. calculator.add(1.5, 3.5)
3. calculator.add(1.5, 3.5).multiply(3).getTotal()

Result: 45

Use case 3
--
1. calculator.add(1.5, 3.5)
2. calculator.add(1.5, 3.5)
3. calculator.add(1.5, 3.5).multiply(3)
4. calculator.clear()
5. calculator.add(1.5, 3.5).multiply(3)

Result: 15
