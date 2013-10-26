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
                  (not (= (first s1) (first s2))) false
                  :else (recur (rest s1) (rest s2))))]
    (helper seq1 seq2)))

;(seq= [1 2 4] '(1 2 4))  ;=> true
;(seq= [1 2 3] [1 2 3 4]) ;=> false
;(seq= [1 3 5] [])        ;=> false

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

