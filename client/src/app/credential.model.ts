export class CredentialModel {
  public name?: string;
  public password?: string;

  constructor(
              name ?: string,
              password ?: string,
              ) {
    this.name = name ? name : null;
    this.password = password ? password : null;
  }
}
