(defproject ejc-sql "0.0.1-SNAPSHOT"
  :description "Interact with database via java/clojure libs to run SQL/JPQL scripts"
  :url "https://github.com/kostafey/ejc-sql"
  :license {:name "GPL 2.0+"
            :url "http://www.gnu.org/licenses/old-licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [org.clojure/java.jdbc "0.5.8"]
                 [org.apache.openjpa/openjpa-all "2.2.2"]
                 [com.cemerick/pomegranate "0.3.0"]
                 [org.apache.commons/commons-lang3 "3.2.1"]])
