# kt



## Kotlinをワンコマンド`kt`で実行する

Kotlinでサクッと動作を確認する場合、以下の二行を実行していたのですが、面倒でした。

```bash
kotlinc -include-runtime -d a.jar
java -jar a.jar
```

## `kt`スクリプトでワンコマンドで解決

以下のスクリプトを作りました。

```shell:kt
#!/bin/bash
if test -f "$1"; then
  if kotlinc -include-runtime -d a.jar "$1"; then
    java -jar a.jar
  else
      echo "compile failed"
      exit 1
  fi

else
  echo "$1 doesn't exist"
fi
```

`kt a.kt`といった感じで実行できます

[github](https://github.com/programmerkgit/kt) にあげています。
インストールして`chmod +x kt`してPathを通せば実行できます。
