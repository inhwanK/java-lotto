### 구현 기능 목록 (v1.4.2)
- [x] 사용자로부터 메시지를 입력받거나 안내 및 결과 메시지를 출력하는 객체
  - [x] 금액 입력 안내 및 입력 받기
  - [x] 발행한 로또 번호 출력
  - [x] 당첨 번호 입력 안내
  - [x] 입력 유효성 검증


- [x] 로또 구입 금액에 맞게 로또를 발행하는 객체
  - [x] 금액에 맞게 로또 개수를 계산
  - [x] 구입한 로또 개수 안내
  - [x] 계산한 개수만큼 로또를 발행


- [x] 당첨 로또 생성 (보너스 번호 포함)
  - [x] 당첨 번호 입력받기
  - [x] 당첨 번호 유효성 검증
  - [x] 당첨 번호에 맞는 로또 객체 생성 및 저장
  - [x] 보너스 번호 입력받기
  - [x] 보너스 번호 유효성 검증
  - [x] 보너스를 포함한 당첨 번호 로또 객체 생성

- [ ] 당첨 통계 정보 생성
  - [x] 통계 정보 저장
  - [ ] 수익률 계산
  
- [ ] 결과 출력하기
- [ ] 잘못된 값을 입력할 경우 로그 출력 및 예외 발생


### 책임 주도 설계 시도해보기
- 시스템이 사용자에게 제공해야 하는 기능인 시스템 책임 파악
- 시스템 책임을 더 작은 책임으로 분할
- 분할된 책임을 수행할 수 있는 적절한 객체 또는 역할을 찾아 책임 할당
- 객체가 책임을 수행하는 도중 다른 객체의 도움이 필요한 경우 이를 책임질 적절한 객체 또는 역할 찾기
- 해당 객체 또는 역할에게 책임을 할당함으로써 두 객체의 협력을 구현