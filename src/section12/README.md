### Generics:
![img.png](img.png)

![img_1.png](img_1.png)

![img_2.png](img_2.png)

![img_3.png](img_3.png)

### Comparable vs Comparator:
| Feature | Comparable | Comparator |
|--------|------------|------------|
| Interface method | `compareTo()` | `compare()` |
| Sorting type | Natural ordering | Custom / multiple orderings |
| Affects class? | Yes — requires modifying the class | No — kept outside the class |
| Number of orderings | Only one | Many (flexible) |
| Used in | `Collections.sort(list)` or `Arrays.sort()` | `Collections.sort(list, comparator)` or `stream().sorted(comparator)` |
| Typical use case | When object has a default/natural sort order | When different sorting strategies are needed |
| Package | `java.lang` | `java.util` |
| Easy example | Sort by ID | Sort by name, salary, age, etc. |

### Wildcards:
![img_4.png](img_4.png)

![img_5.png](img_5.png)

### TypeErasure:
- Type Erasure removes generic type information at runtime, making List<String> and List<Integer> the same List class.
- Generics exists only at compile time, not runtime.
![img_6.png](img_6.png)