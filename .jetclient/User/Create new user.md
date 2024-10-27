```toml
name = 'Create new user'
method = 'POST'
url = '{{baseUrl}}/users/add'
sortWeight = 1000000
id = '82524548-43b0-4a8d-bfdd-d91edb1236f1'

[body]
type = 'JSON'
raw = '''
{
  "firstName": "Afonso",
  "lastName":  "Nzango",
  "email":  "afonso1.nzango@mail.com",
  "password":  "1234"
}'''
```
