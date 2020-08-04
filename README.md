# example-simple-jersey

## Overview

Jersey を Gradle だけで実行するためのサンプルプロジェクトです。
起動後に、リソースクラスにアクセスすることで、XML形式、JSON形式のレスポンスを取得することができます。

## Requirement

* Java Development Kit（JDK）：11+

## Install

```sh
$ git clone https://github.com/fumidzuki/example-simple-jersey.git
```

## Usage

指定したサーブレットコンテナの起動方法になります。

### Tomcat

```sh
$ cd example-simple-jersey
$ gradlew tomcatRun
```

### Jetty

```sh
$ cd example-simple-jersey
$ gradlew jettyRun
```

リソースクラスのアクセス方法は次のようになります。

### JSON形式

```
http://localhost:8080/example-simple-jersey/json
```

### XML形式

```
http://localhost:8080/example-simple-jersey/xml
```

## Note

ビルドスクリプトに、JSON形式、XML形式のレスポンスを取得するためのライブラリを指定しています。

### org.glassfish.jersey.media:jersey-media-json-jackson

JSON形式のレスポンスを作成するために必要なライブラリです。
このライブラリが存在しないと、次のエラーが発生します。

```java
MessageBodyWriter not found for media type=application/json
```

### org.glassfish.jaxb:jaxb-runtime

XML形式のレスポンスを作成するために必要なライブラリです。
このライブラリが存在しないと、次のエラーが発生します。

```java
MessageBodyWriter not found for media type=application/xml
```

## Licence

[MIT](https://github.com/fumidzuki/example-simple-jersey/blob/master/LICENSE)

## Author

[fumidzuki](https://fumidzuki.com)
