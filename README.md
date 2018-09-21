ソース取得後、次の作業を行うとWebアプリケーションとして起動できる状態になります。

※JDKとTomcatのインストールと設定が終わっていることが前提です。
  また、eclipseのマーケットプレイスから『Gradle IDE Pack』をインストールして下さい。

①プロジェクトフォルダ直下の、『gradlew.bat』をダブルクリック
②①の処理が終わったら、プロジェクトフォルダを右クリックして、構成 -> Gradle ネーチャーの追加
③プロジェクトフォルダを右クリックして、Gradle -> Gradleプロジェクトのリフレッシュ
④build.gradleファイルを右クリックして、実行 -> gradle build
⑤Tomcatを起動すると、ブラウザからリソースにアクセスできます。



【演習問題】

＜読み取り問題＞
ソースフォルダに配置された次のリソースをWebブラウザに表示させるための
URIを考えて、実際に自身のPCのWebブラウザ上に表示させてください。

●問題01
src > main > javaフォルダ上にあるサーブレット『Practice01』の画面を
をWebブラウザ上に表示させるためのURIをお答えください。

●問題02
src > main > webapp > contentsフォルダ上にある『Practice02.html』を
のWebブラウザ上に表示させるためのURIをお答えください。

●問題03
src > main > webapp > contents > pictureフォルダ上にある『Practice03.png』を
のWebブラウザ上に表示させるためのURIをお答えください。


＜配置問題＞
URIとリソースを提示するので、そのリソースを提示したURIで読み込むには
プロジェクト上のどのフォルダ上にリソースを置けばよいか考えてみてください。
また実際にブラウザに提示したURIを入力してリソースを表示させてみてください。

●問題04
リソース：temporaryフォルダ上の『Practice04.html』
URI：http://localhost:8080/uri-training/Practice04.html

●問題05
リソース：temporaryフォルダ上の『Practice05.java』
URI：http://localhost:8080/uri-training/Practice05

●問題06
問題05の配置を一切変えずに、次のURIで『Practice05.java』を読み取れるよう
web.xmlの内容を書き換えてみましょう。

URI：http://localhost:8080/uri-training/complete



～以上で演習問題は終わりです。お疲れ様でした。～
