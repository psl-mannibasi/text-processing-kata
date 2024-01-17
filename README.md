# text-processing-kata
## Introduction
As a developer that writes blog posts I want a tool that helps me better understand the text I am writing. For that I need a way to know the following:
1. What are the most common words used in the text?
2. How many words does the text have?

### Challenge 1
Given the following text:
```
Hello, this is an example for you to practice. You should grab this text and use it as your test case.
```

The output should be:
```
The top 10 words used include:

1. you
2. this
3. your
4. to
5. text
6. test
7. should
8. practice
9. use
10. it

The text has 21 words in total
```

Please note the following:
* The example assumes that You and you are the same (in other words it's not case-sensitive)
* There is no order in which the words that have the same number are listed. For example, "this" and "it", appear once, and they are not alphabetically ordered

### Challenge 2
Now I would like to know how much time would it take the user to read my post, for that I should apply the following formula/process:
1. Get the total word count
2. Divide the total word count by 200 (taking 200 WPM as an average reading speed)
3. Take the number before the decimal returned by step 2 as the minutes
4. Take the decimal points and multiply that number by .60 for the seconds

For example, given a total word count of 783 words:
```
783 / 200 = 3.915 (3 minutes)
.915 * 0.6 = .549 (55 seconds)
```
So, the reading time in this instance would be **3 minutes 54 seconds**