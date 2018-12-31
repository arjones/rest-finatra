# Portfolio Asset Tracker
A learning experiment using:

* Scala
* Finatra
* Postgres
* React (?)

## Usage

```bash
docker-compose up
```

```bash
curl 0.0.0.0:8888/v1/assets | jq .

curl 0.0.0.0:8888/v1/assets/GOOG | jq .
```

## References / Learning material

* https://github.com/teaddict/turkce-metin-ozetleme-scala/
* https://finagle.github.io/finagle-postgres/
