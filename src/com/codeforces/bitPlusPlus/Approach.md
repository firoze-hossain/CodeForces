https://codeforces.com/problemset/problem/282/A<br/>
<b>A. Bit++</b><br/>

The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.<br/>

The language is that peculiar as it has exactly one variable, called x. Also, there are two operations:<br/>

Operation ++ increases the value of variable x by 1.<br/>
Operation -- decreases the value of variable x by 1.<br/>
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. The statement is written without spaces, that is, it can only contain characters "+", "-", "X". Executing a statement means applying the operation it contains.<br/>

A programme in Bit++ is a sequence of statements, each of them needs to be executed. Executing a programme means executing all the statements it contains.<br/>

You're given a programme in language Bit++. The initial value of x is 0. Execute the programme and find its final value (the value of the variable when this programme is executed).<br/>

<b>Input</b>
The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.<br/>

Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. The operation and the variable can be written in any order.<br/>

<b>Output</b><br/>
Print a single integer — the final value of x.<br/>

<b>Examples</b><br/>
<b>input</b><br/>
1<br/>
++X<br/>
<b>output</b><br/>
1<br/>
<b>input</b><br/>
2<br/>
X++<br/>
--X<br/>
<b>output</b><br/>
0