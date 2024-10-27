```toml
name = 'Login'
method = 'POST'
url = '{{baseUrl}}/auth/login'
sortWeight = 1000000
id = '093bdb31-bcae-4c04-93c3-569af40be8a2'

[body]
type = 'JSON'
raw = '''
{
  "email": "afonso1.nzango@gmail.com",
  "password": "1234"
}'''
```
