export class CredentialModel {
  public username?: string;
  public password?: string;

  constructor(
              username ?: string,
              password ?: string,
              ) {
    this.username = username ? username : null;
    this.password = password ? password : null;
  }
}
