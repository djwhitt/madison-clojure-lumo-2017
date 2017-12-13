(ns ffi.core
  (:require [ffi]))

(def libm (.Library ffi "libm" (clj->js {"ceil" [ "double" ["double" ] ]})))

(println (.ceil libm 1.5))
