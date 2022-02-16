class MemberDetail extends React.Component {


    render() {
        let m = this.props.member;
        return (
            <div key={idx}>
                    <span>{m.name}</span>
                    <span>{m.email}</span>
            </div>
        );
    }
}