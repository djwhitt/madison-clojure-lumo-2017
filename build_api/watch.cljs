(require '[lumo.build.api :as b])

(b/watch "src" {:main 'hello-world.core
                :output-to "out/main.js"
                :optimizations :advanced
                :target :nodejs
                :watch-fn #(println "Success!")})
