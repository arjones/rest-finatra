# Portfolio Asset Tracker
A learning experiment using:

* Scala
* Finatra
* Postgres

## Usage

```bash
# Run postgres
docker-compose up -d

# Build, Package & Run
sbt clean stage
cd target/universal/stage/
bin/rest-finatra
```

```bash
curl 0.0.0.0:8888/v1/assets | jq .

curl 0.0.0.0:8888/v1/assets/GOOG | jq .
curl 0.0.0.0:8888/v1/assets/ORCL,AAPL,IBM | jq .
```

## References / Learning material

* https://github.com/teaddict/turkce-metin-ozetleme-scala/
* https://finagle.github.io/finagle-postgres/
