tree -a -I '.git|.idea|out|Programming.iml|temp*|test*' -t -f | sed '$ d' | sed 's/`/|/g' |  sed '$ d' > tempReadMe
awk 'NF>1{print $NF}' tempReadMe > tempFile
# sed -i 's/\(.*\)/\(\1\)/' tempFile
sed -i 's/\.\///g' tempFile
linkAddress="https://github.com/cse001/Programming/tree/main/"
echo "" > tempFile2
for LINE in $(cat tempFile)
do
    echo "($LINE)[$linkAddress$LINE]" >> tempFile2
done
echo "# Table of Contents" > README.md
tree -a -I '.git|.idea|out|Programming.iml|temp*|test*' -t | sed '$ d' | sed 's/`/|/g' |  sed '$ d' >> README.md
cat README.md | grep -v -i "content" | awk 'NF>1{print $NF}' > tempFile3
for LINE in $(cat tempFile3)
do
    link=$(cat tempFile2 | grep -w $LINE | head -1)
    sed -i "s|$LINE|$link|g" README.md
done
