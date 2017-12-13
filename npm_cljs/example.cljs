(require '[net.cgrand.packed-printer :refer [pprint]])

(pprint (partition 10 (range 50)) :width 15)
