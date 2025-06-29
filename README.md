# 10828_javastack
### 백준 10828 스택 구현 문제를 자바로 풀이하였다. 

250611 -> Scanner와 Stringbuilder를 이용하였다. 
하지만 내가 생각한 자바 컬렉션을 이용한 풀이가 아니라 배열을 이용한 풀이기에 다시 자바 컬렉션을 사용하여 풀이해봐야겠다. 
public static int[] stack; -> 배열 기반의 직접 구현 형식

250612 -> Arraylist를 사용하여 스택을 다시 공부하였다. 
// ArrayList<Integer> stack = new ArrayList<>(); 


## 공통점
 
| 항목                                   |       설명                                             |
| ------------------------------------- | ----------------------------------------------         |
| 📦 Java Collection Framework에 포함됨 | `java.util` 패키지에 있음                               |
| 💬 객체(참조형)만 저장 가능            | 기본형(int, double 등)은 `Integer`, `Double`로 자동 변환 |
| 🔄 반복 가능                          | `for-each`, `Iterator` 사용 가능                        |
| 🚫 크기 고정 없음                      | 배열과 달리 **동적으로 크기 조절** 가능                  |
| ✅ null 저장 가능                     | 단, `Set`은 1개만 저장됨                                |
 
## 차이점 
| 특징        | **ArrayList**      | **LinkedList** | **Set**                               |
| ---------   | ------------------ | -------------- | ------------------------------------- |
| 📚 구조     | 배열 기반              | 연결 리스트(노드 기반)  | 순서 없는 집합                              |
| 🔢 인덱스 접근 | ✅ 빠름 (O(1))        | ❌ 느림 (O(n))    | ❌ 인덱스 없음                              |
| ➕ 추가/삭제   | 끝에 추가 빠름, 중간 삭제 느림 | 중간 삽입/삭제 빠름    | 중복 없이 추가만                             |
| 🔁 순서 유지  | ✅ 입력 순서 유지         | ✅ 입력 순서 유지     | ❌ 일반적으로 순서 없음 (`HashSet`)             |
| 🔁 중복 허용  | ✅ 허용               | ✅ 허용           | ❌ 허용하지 않음                             |
| 대표 구현체    | `ArrayList`        | `LinkedList`   | `HashSet`, `LinkedHashSet`, `TreeSet` |

## 언제 어떻게 사용하는게 좋을지

| 상황               | 추천 컬렉션          | 이유                  |
| ---------------- | -------------- | ------------------- |
| 인덱스로 빠르게 접근하고 싶다 | `ArrayList`     | `get(index)` 빠름     |
| 자주 삽입/삭제가 발생한다   | `LinkedList`    | 연결 구조라 중간 삽입/삭제 효율적 |
| 중복 없이 고유한 값만 저장  | `Set`           | 자동으로 중복 제거          |
| 순서 + 중복 없이 저장    | `LinkedHashSet` | 입력 순서 유지 + 중복 제거    |
| 정렬된 값 저장         | `TreeSet`       | 자동 정렬 + 중복 제거       |

## 요약
🔹 ArrayList = 배열처럼 빠른 접근, 중복 OK
🔹 LinkedList = 자주 추가/삭제할 때 효율적
🔹 Set = 중복 제거, 순서 필요 없을 때
