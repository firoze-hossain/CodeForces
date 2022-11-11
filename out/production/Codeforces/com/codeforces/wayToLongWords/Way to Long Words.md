https://codeforces.com/problemset/problem/71/A
<br/>
<b>A. Way Too Long Words</b><br/>

Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.

<b>Input</b><br/>
The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.

<b>Output</b><br/>
Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.

<b>Examples</b><br/>
<b>input</b><br/>
4<br/>
word<br/>
localization<br/>
internationalization<br/>
pneumonoultramicroscopicsilicovolcanoconiosis<br/>
<b>output</b><br/>
word<br/>
l10n<br/>
i18n<br/>
p43s<br/>
