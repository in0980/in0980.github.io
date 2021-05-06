grammarinator-process romannumerals.g4 -o romannumerals/ --no-actions
cd romannumerals
grammarinator-generate -l romannumeralsUnlexer.py -p romannumeralsUnparser.py -r expression -n 10 -d 15 -o tests/test_%d.txt
cd tests
find ./ -type f | xargs tail -n +1