```mermaid
sequenceDiagram
participant User
participant OrderService
participant Payment

User->>OrderService: payRequest(amount)
OrderService->>Payment: pay(amount)
Payment-->>OrderService: success/failure
OrderService-->>User: paymentResult()
```