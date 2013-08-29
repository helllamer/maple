(defproject com.twitter/maple "0.2.8"
  :source-paths ["src/clj"]
  :java-source-paths ["src/jvm"]
  :url "http://github.com/Cascading/maple"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :description "All the Cascading taps we have to offer."
  :repositories [["conjars" "http://conjars.org/repo/"]
                 ["apache"  "https://repository.apache.org/content/repositories/releases"]]
  :profiles {:provided {:dependencies [[org.apache.hbase/hbase-server "0.95.1-hadoop1"
                                        :exclusions [org.apache.hadoop/hadoop-core asm]]]}
             :dev {:dependencies [[midje "1.5.0" :exclusions [org.clojure/clojure]]
                                  [org.clojure/clojure "1.5.1"]
                                  [org.apache.hadoop/hadoop-core "1.1.2"]
                                  [asm "3.2"]
                                  [cascading/cascading-hadoop "2.1.6"
                                   :exclusions [org.codehaus.janino/janino
                                                org.apache.hadoop/hadoop-core]]]}})
