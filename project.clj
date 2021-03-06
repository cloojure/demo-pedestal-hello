(defproject demo-pedestal-hello "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [  [org.clojure/clojure "1.7.0-alpha4"]
                   [com.datomic/datomic-free "0.8.3826"]
                   [io.pedestal/pedestal.service "0.3.1"]

                   ;; Remove this line and uncomment one of the next lines to
                   ;; use Tomcat or Immutant instead of Jetty:
                   [io.pedestal/pedestal.jetty "0.3.1"]
                   ;; [io.pedestal/pedestal.tomcat "0.3.1"]
                   ;; [io.pedestal/pedestal.immutant "0.3.1"]

                   [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                   [org.slf4j/jul-to-slf4j "1.7.7"]
                   [org.slf4j/jcl-over-slf4j "1.7.7"]
                   [org.slf4j/log4j-over-slf4j "1.7.7"]
                   [com.taoensso/timbre "3.3.1" :exclusions [org.clojure/tools.reader]]
                   [cooljure "0.1.15"]
                 ]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "demo-pedestal-hello.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.3.1"]]}}
  :main ^{:skip-aot true} demo-pedestal-hello.server)

