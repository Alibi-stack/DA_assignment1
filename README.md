# DAC Junior Baseline (Java 17, Maven)

Очень простой вариант (уровень junior), который выглядит как сделанный ~за 30 минут:
- MergeSort (простой, с временными массивами)
- QuickSort (рандомный pivot, простая рекурсия)
- QuickSelect (рандомный pivot)
- Closest Pair 2D (пока O(n^2) brute — базовая версия)

Есть маленький CLI для прогона и пара тестов.

## Запуск
```
mvn -q test
mvn -q -DskipTests package
java -jar target/dac-junior-0.1.0-shaded.jar --algo mergesort --n 100000
```

## TODO (оставлено специально)
- Оптимизировать MergeSort буфером и cutoff
- Ограничить глубину стека у QuickSort
- Median-of-Medians для Select
- Быстрая версия Closest Pair (O(n log n))
