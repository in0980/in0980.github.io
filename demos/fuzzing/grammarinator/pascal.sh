grammarinator-process pascal.g4 -o pascal/ --no-actions
cd pascal
grammarinator-generate -l pascalUnlexer.py -p pascalUnparser.py -r program -n 10 -d 15 -o tests/test_%d.txt
cd tests
find ./ -type f | xargs tail -n +1