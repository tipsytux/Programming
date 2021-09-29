tree -a -I '.git|.idea|out|Programming.iml' -t -f | sed '$ d' | sed 's/`/|/g' |  sed '$ d' > tempReadMe
awk 'NF>1{print $NF}' README.md > tempFile
sed -i 's/\(.*\)/\(\1\)/' tempFile
sed -i 's/.\///g' tempFile
for LINE in $(cat tempFile)
do
    echo "$LINE"
done
