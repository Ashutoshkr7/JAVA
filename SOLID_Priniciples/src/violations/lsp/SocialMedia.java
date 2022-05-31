package violations.lsp;

public abstract class SocialMedia {

    //@support Whatsapp, Facebook, Instagram
    public abstract void chatWIthFriends();

    //@support Facebook, Instagram
    public abstract void publishPost(Object Post);

    //@support Whatsapp, Facebook, Instagram
    public abstract void sendPhotosAndVidoes();

    //@support Whatsapp, Facebook
    public abstract void groupVideoCall(String... users);

}
