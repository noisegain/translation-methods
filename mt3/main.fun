Int a(Int b) =
    if true then (1 - 1) else match b with
        | 0 -> 1
        | 1 -> 2
        | 3


Int b(Bool a) =
    if a then match 1 with | 0 -> (1 - 2) | 1 -> 2 | (3 + 4) else 2

Bool cond(Int x) = match (x) with
    | 0 -> true
    | 2 -> true
    | false

Int xxx(Int a, Int b, Int c) =
    if cond ^ a ; then a + b else a + c

Bool helper(Int n, Int m) =
            if m * m > n then true
            else if n % m == 0 then false
            else helper^n, m + 1;

Bool isPrime(Int n)
    | 1 -> false
    | 2 -> true
    = helper^n,2;

Int gcd(Int a, Int b)
    | _, 0 -> a
    = gcd^ b, a % b;
