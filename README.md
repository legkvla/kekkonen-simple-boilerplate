# jess api

Minimal template for Kekkonen.

## Usage

### Run the application locally

```
cp profiles-template.clj profiles.clj
lein run
```

### Packaging and running as standalone jar

```
lein uberjar
java -server -jar target/jess.jar
```

### Deploying to Heroku

```
heroku apps:create
git push heroku
heroku config:set MASTER_TOKEN="`openssl rand -base64 1024 | tr -d '\n '; echo`"
heroku config:set USER_TOKEN="`openssl rand -base64 1024 | tr -d '\n '; echo`"
```

## How to

### Generate random token

```
openssl rand -base64 1024 | tr -d '\n '; echo
```

Copyright © 2020
