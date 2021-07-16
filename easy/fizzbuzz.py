def fizzbuzz(n):
	for i in range(1, n):
		fizz = (i % 3) == 0
		buzz = (i % 5) == 0
		fizzbuzz = fizz and buzz
		if fizzbuzz:
			print("fizzbuzz")
		elif fizz:
			print("fizz")
		elif buzz:
			print("buzz")
		else:
			print(i)
