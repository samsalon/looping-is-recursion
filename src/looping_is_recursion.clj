(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc base exp]
                 (cond
                  (zero? exp) 1
                  (= 1 exp) acc
                  :else (recur (* acc base) base (dec exp))))]
        (helper base base exp)))

(defn last-element [a-seq]
  (let [helper (fn [a-seq]
                 (cond
                  (empty? (rest a-seq)) (first a-seq)
                  :else (recur (rest a-seq))))]
    (helper a-seq)))

;(last-element [])      ;=> nil
;(last-element [1 2 3]) ;=> 3
;(last-element [2 5])   ;=> 5

(defn seq= [seq1 seq2]
  (let [helper (fn [s1 s2]
                 (cond
                  (and (empty? s1) (empty? s2)) true
                  (or (empty? s1) (empty? s2)) false
                  (not (= (first s1) (first s2))) false
                  :else (recur (rest s1) (rest s2))))]
    (helper seq1 seq2)))

;(seq= [1 2 4] '(1 2 4))  ;=> true
;(seq= [] [])             ;=> true
;(seq= [1 2 nil] [1 2])   ;=> false
;(seq= [1 4 2] [1 2 4])   ;=> false
;(seq= [1 2 3] [1 2 3 4]) ;=> false
;(seq= [1 3 5] [])        ;=> false

(defn find-first-index [pred a-seq]
  (loop [p pred
         i 0
         s a-seq]
    (if (empty? s)
      nil
      (if (p (first s))
        i
        (if (empty? (rest s)) nil (recur p (inc i) (rest s)))))))

;(find-first-index zero? [1 1 1 0 3 7 0 2])                    ;=> 3
;(find-first-index zero? [1 1 3 7 2])                          ;=> nil
;(find-first-index (fn [n] (= n 6)) [:cat :dog :six :blorg 6]) ;=> 4
;(find-first-index nil? [])                                    ;=> nil

(defn avg [a-seq]
  -1)

;(avg [1 2 3])   ;=> 2
;(avg [0 0 0 4]) ;=> 1
;(avg [1 0 0 1]) ;=> 1/2 ;; or 0.5

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

