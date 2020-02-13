# jess api

Minimal template for Kekkonen.

## Usage

### Run the application locally

```
lein run
```

### Packaging and running as standalone jar

```
lein uberjar
java -server -jar target/jess.jar
```

## How to

### Generate random token

```
openssl rand -base64 1024
```

Copyright © 2020
