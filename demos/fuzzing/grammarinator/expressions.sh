grammarinator-process expressions.g4 -o expressions/ --no-actions
cd expressions
grammarinator-generate -l expressionsUnlexer.py -p expressionsUnparser.py -r file -n 10 -d 15 -o tests/test_%d.txt
cd tests
find ./ -type f | xargs tail -n +1