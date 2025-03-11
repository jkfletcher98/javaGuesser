# javaGuesser
Create a number guesser in java. There will be a main menu with the options to exit, user guess, and computer guess.

## main
```
set keepGoing to true
create while loop
	create main menu
	0) Exit
	1) User guess
	2) Computer guess
	Select 0, 1, or 2
	set response to user input
	
	if response is 0
		keepGoing gets false
		program ends

	if response is 1
		run userGuess
		program continues

	if response is 2
		run cpuGess
		program continues

	else
		print "I'm not sure I understand"
		program continues
```

## userGuess
```
correct gets a random number from 1 to 100.
tries gets 0
print "I'm think of a number between 1 and 100. Can you guess it"
create a while keepGoing loop
	print "What is your guess?"
	put input into guess

	if guess is greater than correct
		"too high"
		tries += 1
		loop continues
		
	if gues is less than correct
		"too low"
		tries += 1
		loop continues

	if guess is equal to correct
		"that's it"
		loop ends

	if tries is greater than or equal to 7
		"better luck next time"
		loop ends
```

## cpuGuess
```
upper gets 100
lower gets 1
tries gets 0
guess gets (upper - lower) / 2 rounded up

print "Think of a number between 1 and 100. I'll see if I can guess it"

create while keepGoing loop
	print "Is it {guess}?"
	ask for response - too high, too low, correct

	if response is too high
		upper gets guess
		tries += 1
		loop continues

	if response if too low
		lower gets guess
		tries += 1
		loop conitues

	if response is correct
		"I win!"
		loop ends

	if tries greater than or equal to 7
		"you win!"
		loop ends
```	
