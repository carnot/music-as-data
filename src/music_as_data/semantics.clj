(ns music-as-data.semantics
  (:use [music-as-data.elements]
		[music-as-data.mfunctions]))


(defn join [& notes]
  (music-as-data.elements.Melement. 0 0 0 play-chord
			 (first (conj [] notes))))

;; Maybe defmulti?
(defmacro + [& more]
  ;; make chords like (+ kick hihat)
  `(join ~@more))

