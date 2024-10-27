```toml
name = 'Delete a user'
method = 'DELETE'
url = '{{baseUrl}}/users/{userId}/delete'
sortWeight = 4000000
id = '2e2202a4-d4bf-455b-87c7-bcfa716ef10d'

[[pathVariables]]
key = 'userId'
value = '8'

[body]
type = 'JSON'
raw = '''
{
  "firstName": "Afonso",
  "lastName": "Nzango",
}'''
```
