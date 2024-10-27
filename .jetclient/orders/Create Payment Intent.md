```toml
name = 'Create Payment Intent'
method = 'POST'
url = '{{baseUrl}}/orders/payment/create-payment-intent'
sortWeight = 4000000
id = 'c9119e9a-acdd-4685-9efb-d9b981dffbba'

[body]
type = 'JSON'
raw = '''
{
  "amount": 400,
  "currency": "USD"
}'''
```
