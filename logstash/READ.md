PUT /program
{
  "mappings" : {
    "program" : {
      "properties" : {
        "detail" : {
          "type" : "text",
          "analyzer": "custom_analyzer",
          "search_analyzer": "custom_analyzer",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        },
        "id" : {
          "type" : "text",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        },
        "introjection" : {
          "type" : "text",
          "analyzer": "custom_analyzer",
          "search_analyzer": "custom_analyzer",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        },
        "name" : {
          "type" : "text",
          "analyzer": "custom_analyzer",
          "search_analyzer": "custom_analyzer",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        },
        "region" : {
          "type" : "text",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        },
        "theme" : {
          "type" : "text",
          "fields" : {
            "keyword" : {
              "type" : "keyword",
              "ignore_above" : 256
            }
          }
        }
      }
    }
  },
  "settings" : {
    "index" : {
      "analysis": {
        "analyzer": {
          "custom_analyzer": {
            "type": "custom",
            "tokenizer": "nori_tokenizer",
            "filter": [
              "lowercase",
              "custom_edge_ngram"
            ]
          }
        },
        "filter": {
          "custom_edge_ngram": {
            "type": "edge_ngram",
            "min_gram": 2,
            "max_gram": 10
          }
        }
      }
    }
  }
}

GET program

GET /program/program/_search
{
  "query": {
    "match": {
      "name": "자연"
    }
  }
}